import java.util.*;
import java.util.regex.*;
import java.text.*;

class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    int getID() {
        return id;
    }

    String getName() {
        return name;
    }

    double getCGPA() {
        return cgpa;
    }
}

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student x, Student y) {
        if (x.getCGPA() > y.getCGPA()) {
            return -1;
        } else if (x.getCGPA() < y.getCGPA()) {
            return 1;
        } else {
            int tmp = x.getName().compareTo(y.getName());
            if(tmp > 1) {
                return 1;
            } else if(tmp < 1){
                return -1;
            } else {
                if(x.getID() > y.getID()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }
    }
}

class Priorities {

    List<Student> getStudents(List<String> events) {
        List<Student> l = new ArrayList<Student>();
        StudentComparator sc = new StudentComparator();
        PriorityQueue<Student> pq = new PriorityQueue<Student>(10, sc);
        String regex = "ENTER (\\w+) (\\S+) (\\d+)";
        Pattern p = Pattern.compile(regex);

        for(String ev: events) {
            if(ev.startsWith("ENTER")) {
                Matcher m = p.matcher(ev);
                if(m.find()) {
                    NumberFormat format = NumberFormat.getInstance(Locale.US);
                    try {
                        Number number = format.parse(m.group(2));
                        pq.add(new Student(Integer.parseInt(m.group(3)), m.group(1), number.doubleValue()));
                    } catch(Exception e) {
                    }
                }
            } else {
                pq.poll();
            }

        }
        int n = pq.size();
        for(int i = 0; i < n; i++) {
            l.add(pq.poll());
        }
        return l;
    }
}

class JavaPriorityQueue {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}

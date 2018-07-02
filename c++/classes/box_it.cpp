// https://www.hackerrank.com/challenges/box-it/problem

#include<bits/stdc++.h>
using namespace std;

class Box {
private:
    int l, b, h;
public:
    Box(int l = 0, int b = 0, int h = 0): l(l), b(b), h(h) { }
    Box(const Box &B) { l = B.l; b = B.b; h = B.h; }
    int getLength() const { return l;}
    int getBreadth() const { return b;}
    int getHeight() const { return h;}
    long long CalculateVolume() const { return (long long)l*b*h;}
};

std::ostream& operator<<(std::ostream& out, const Box &B){
    return out << B.getLength() << " " << B.getBreadth() << " " << B.getHeight();
}

bool operator<(const Box& A, const Box& B){
    if(A.getLength() < B.getLength())
        return true;
    if(A.getBreadth()<B.getBreadth() && A.getLength()==B.getLength())
        return true;
    if(A.getHeight()<B.getHeight()
       && A.getBreadth()==B.getBreadth()
       && A.getLength()==B.getLength())
        return true;
    return  false;
}

void check2()
{
	int n;
	cin>>n;
	Box temp;
	for(int i=0;i<n;i++)
	{
		int type;
		cin>>type;
		if(type ==1)
		{
			cout<<temp<<endl;
		}
		if(type == 2)
		{
			int l,b,h;
			cin>>l>>b>>h;
			Box NewBox(l,b,h);
			temp=NewBox;
			cout<<temp<<endl;
		}
		if(type==3)
		{
			int l,b,h;
			cin>>l>>b>>h;
			Box NewBox(l,b,h);
			if(NewBox<temp)
			{
				cout<<"Lesser\n";
			}
			else
			{
				cout<<"Greater\n";
			}
		}
		if(type==4)
		{
			cout<<temp.CalculateVolume()<<endl;
		}
		if(type==5)
		{
			Box NewBox(temp);
			cout<<NewBox<<endl;
		}

	}
}

int main()
{
	check2();
}

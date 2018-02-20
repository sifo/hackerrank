# https://www.hackerrank.com/challenges/html-parser-part-1/problem

from html.parser import HTMLParser

class MyHTMLParser(HTMLParser):
    def handle_starttag(self, tag, attrs):
        print("Start :", tag)
        for a in attrs:
            print("-> {} > {}".format(a[0], a[1]))
    def handle_endtag(self, tag):
        print("End   :", tag)
    def handle_startendtag(self, tag, attrs):
        print("Empty :", tag)
        for a in attrs:
            print("-> {} > {}".format(a[0], a[1]))

if __name__ == '__main__':
    parser = MyHTMLParser()
    for _ in range(int(input())):
        parser.feed(input())

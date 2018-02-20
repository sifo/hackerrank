# https://www.hackerrank.com/challenges/detect-html-tags-attributes-and-attribute-values/problem

from html.parser import HTMLParser

class MyHTMLParser(HTMLParser):
    def handle_starttag(self, tag, attrs):
        print(tag)
        for a in attrs:
            print("-> {} > {}".format(a[0], a[1]))
    def handle_startendtag(self, tag, attrs):
        print(tag)
        for a in attrs:
            print("-> {} > {}".format(a[0], a[1]))

if __name__ == '__main__':
    parser = MyHTMLParser()
    for _ in range(int(input())):
        parser.feed(input())

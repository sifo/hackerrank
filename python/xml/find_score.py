# https://www.hackerrank.com/challenges/xml-1-find-the-score/problem

import sys
import xml.etree.ElementTree as etree

def get_attr_number(node):
    r = len(node.attrib)
    for n in node:
        r += len(n.attrib)
        for m in n:
            r += len(m.attrib)
    return r

if __name__ == '__main__':
    sys.stdin.readline()
    xml = sys.stdin.read()
    tree = etree.ElementTree(etree.fromstring(xml))
    root = tree.getroot()
    print(get_attr_number(root))

import math
import re
from stringprep import in_table_a1

"""
This module have functions to calculate the area of a triangle, a rectangle and a circle.
"""

def triangle(base, height):
    return base*height/2

def rectangle(base, height):
    return base*height

def circle(radius):
    return math.pi*(radius*2)

def donut(out_radius, in_radius):
    return circle(out_radius) - circle(in_radius)




def part_1():
    f = open("day2_text.txt", "r")
    depth = 0
    pos = 0

    z = f.readlines()
    for c in z:
        c = c.split(" ")
        x = int(c[1])
        if c[0] == "up":
            depth -= x
        elif c[0] == "down" :
            depth += x
        else:
            pos += x
    f.close()
    return depth * pos


def part_2():
    f = open("day2_text.txt", "r")
    depth = 0
    pos = 0
    aim = 0

    z = f.readlines()
    for c in z:
        c = c.split(" ")
        x = int(c[1])
        if c[0] == "up":
            aim -= x
        elif c[0] == "down":
            aim += x
        else:
            pos += x
            depth += x * aim
    
    f.close()
    return pos * depth


if __name__ == "__main__":
    print(part_1())
    print(part_2())

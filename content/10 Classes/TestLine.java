class Point {
    int x, y;
    Point(int x0, int y0) {
        x = x0; y = y0;
    }
    void move(int dx, int dy) {
        x += dx; y += dy;
    }
}

class Line {
    Point start, end;
    boolean invariantOK() {
        return start.x != end.x || start.y != end.y;
    }
    Line(Point s, Point e) {
        assert s.x != e.x || s.y != e.y;
        start = s; end = e;
        assert invariantOK();
    }
    void move(int dx, int dy) {
        start.move(dx, dy); end.move(dx, dy);
        assert invariantOK();
    }
}

class TestLine {
    public static void main(String[] args) {
        Point p = new Point(1, 3); Point q = new Point(2, 4);
        Line l = new Line(p, q); p.move(1, 1);
        assert l.invariantOK();
    }
}

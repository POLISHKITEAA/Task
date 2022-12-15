public class Main {

    public static void main(String[] args) {
        Interval[] intervals = new Interval[3];

        intervals[0] = new Interval(0, 5, true);
        intervals[1] = new Interval(-5, 5, false);
        intervals[2] = new Interval(7, 12, true);

        for (int i = 0; i < intervals.length - 1; i++) {
            intervals[i].combine(intervals[i + 1]);
            intervals[i].crossing(intervals[i + 1]);
        }
    }
}
class Interval {
    private int start, end;
    private boolean isInclude;

    Interval(int start, int end, boolean isInclude) {
        this.start = start;
        this.end = end;
        this.isInclude = isInclude;
    }

    private int getStart() {
        return start;
    }

    private int getEnd() {
        return end;
    }

    @Override
    public String toString() {
        String s1, s2;
        if (isInclude) {
            s1 = "[";
            s2 = "]";
        } else {
            s1 = "(";
            s2 = ")";
        }
        return s1 + start + "; " + end + s2;
    }

    void combine(Interval inter) {
        System.out.println(this + "\t" + inter);
        if (start < inter.getEnd() && inter.getStart() < end) {
            int x = Math.min(start, inter.getStart());
            int y = Math.max(end, inter.getEnd());
            System.out.println("Объединение интервалов: " + x + "..." + y);
        } else System.out.println("Интервалы не пересекаются");
    }

    void crossing(Interval inter) {
        System.out.println(this + "\t" + inter);
        int x = Math.max(start, inter.getStart());
        int y = Math.min(end, inter.getEnd());
        if (x < y) System.out.println("Пересечение интервалов: " + x + "..." + y);
        else System.out.println("Интервалы не пересекаются");
    }
}

package java_basic;

public class Day {
    private int minutes;
    private int seconds;
    private int hours;

    public Day(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // 获取小时数
    public int getHours() {
        return hours;
    }

    // 获取分钟数
    public int getMinutes() {
        return minutes;
    }

    // 获取秒数
    public int getSeconds() {
        return seconds;
    }

}

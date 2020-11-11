class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        // implement me
        this.minutes++;
        if (this.minutes == 60) {
            this.hours = this.hours < 12 ? this.hours + 1 : 1;
            this.minutes = 0;
        }
    }
}
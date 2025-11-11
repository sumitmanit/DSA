class Solution {
    public double angleClock(int hour, int minutes) {
        double angle = 0;

        float div = (float) 5.5;

        double calculateMintes = div*minutes;
        double calculatesHours = 30*hour;

        if(calculateMintes>calculatesHours){
            angle = calculateMintes - calculatesHours;
        }else {
            angle = calculatesHours - calculateMintes;
        }

        if (angle>180) {
            
            angle = 360 - angle;
        }

        return angle;

    }
}
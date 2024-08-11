enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}


class EnumInSwitchStatement {
    public static void main(String[] args) {
        Day[] days = Day.values();

        for (Day day : days) {
            switch (day) {
                case MONDAY:
                    System.out.println("Monday");
                    break;
                case TUESDAY:
                    System.out.println("Tuesday");
                    break;
                case WEDNESDAY:
                    System.out.println("Wednesday");
                    break;
                case THURSDAY:
                    System.out.println("Thursday");
                    break;
                case FRIDAY:
                    System.out.println("Friday");
                    break;
                case SATURDAY:
                    System.out.println("Saturday");
                    break;
                case SUNDAY:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid day");
            }
        }
    }
}

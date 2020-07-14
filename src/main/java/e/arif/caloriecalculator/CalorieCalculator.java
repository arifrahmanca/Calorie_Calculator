package e.arif.caloriecalculator;

public class CalorieCalculator {

    public int getCalorie(String age, String sex, String activity)
    {
        int calorie = 0;
        if (sex.equals("Male"))
        {
            if (activity.equals("Sedentary"))
            {
                if (age.equals("4 - 8 yrs"))
                {
                    calorie = 1400;
                }
                else if (age.equals("9 - 13 yrs"))
                {
                    calorie = 1800;
                }
                else if (age.equals("14 - 18 yrs"))
                {
                    calorie = 2200;
                }
                else if (age.equals("19 - 30 yrs"))
                {
                    calorie = 2400;
                }
                else if (age.equals("31 - 50 yrs"))
                {
                    calorie = 2200;
                }
                else if (age.equals("50+ yrs"))
                {
                    calorie = 2000;
                }
                else
                {
                    calorie = 1000;
                }
            }
            else if (activity.equals("Moderate"))
            {
                if (age.equals("4 - 8 yrs"))
                {
                    calorie = 1600;
                }
                else if (age.equals("9 - 13 yrs"))
                {
                    calorie = 2000;
                }
                else if (age.equals("14 - 18 yrs"))
                {
                    calorie = 2400;
                }
                else if (age.equals("19 - 30 yrs"))
                {
                    calorie = 2600;
                }
                else if (age.equals("31 - 50 yrs"))
                {
                    calorie = 2400;
                }
                else if (age.equals("50+ yrs"))
                {
                    calorie = 2200;
                }
                else
                {
                    calorie = 1200;
                }
            }
            else
            {
                if (age.equals("4 - 8 yrs"))
                {
                    calorie = 1800;
                }
                else if (age.equals("9 - 13 yrs"))
                {
                    calorie = 2200;
                }
                else if (age.equals("14 - 18 yrs"))
                {
                    calorie = 2800;
                }
                else if (age.equals("19 - 30 yrs"))
                {
                    calorie = 3000;
                }
                else if (age.equals("31 - 50 yrs"))
                {
                    calorie = 2800;
                }
                else if (age.equals("50+ yrs"))
                {
                    calorie = 2600;
                }
                else
                {
                    calorie = 1400;
                }
            }
        }

        else
        {
            if (activity.equals("Sedentary"))
            {
                if (age.equals("4 - 8 yrs"))
                {
                    calorie = 1200;
                }
                else if (age.equals("9 - 13 yrs"))
                {
                    calorie = 1600;
                }
                else if (age.equals("14 - 18 yrs"))
                {
                    calorie = 1800;
                }
                else if (age.equals("19 - 30 yrs"))
                {
                    calorie = 2000;
                }
                else if (age.equals("31 - 50 yrs"))
                {
                    calorie = 1800;
                }
                else if (age.equals("50+ yrs"))
                {
                    calorie = 1600;
                }
                else
                {
                    calorie = 1000;
                }
            }
            else if (activity.equals("Moderate"))
            {
                if (age.equals("4 - 8 yrs"))
                {
                    calorie = 1400;
                }
                else if (age.equals("9 - 13 yrs"))
                {
                    calorie = 1800;
                }
                else if (age.equals("14 - 18 yrs"))
                {
                    calorie = 2000;
                }
                else if (age.equals("19 - 30 yrs"))
                {
                    calorie = 2200;
                }
                else if (age.equals("31 - 50 yrs"))
                {
                    calorie = 2000;
                }
                else if (age.equals("50+ yrs"))
                {
                    calorie = 1800;
                }
                else
                {
                    calorie = 1200;
                }
            }
            else
            {
                if (age.equals("4 - 8 yrs"))
                {
                    calorie = 1800;
                }
                else if (age.equals("9 - 13 yrs"))
                {
                    calorie = 2000;
                }
                else if (age.equals("14 - 18 yrs"))
                {
                    calorie = 2400;
                }
                else if (age.equals("19 - 30 yrs"))
                {
                    calorie = 2400;
                }
                else if (age.equals("31 - 50 yrs"))
                {
                    calorie = 2200;
                }
                else if (age.equals("50+ yrs"))
                {
                    calorie = 2000;
                }
                else
                {
                    calorie = 1400;
                }
            }
        }
        return calorie;
    }

    public double getCarb(int calorie)
    {
        double fraction = 4/6.0;
        double req = calorie * fraction;
        return req / 4;
    }

    public double getProtein(int calorie)
    {
        double fraction = 1/6.0;
        double req = calorie * fraction;
        return req / 4;
    }

    public double getFat(int calorie)
    {
        double fraction = 1/6.0;
        double req = calorie * fraction;
        return req / 9;
    }
}

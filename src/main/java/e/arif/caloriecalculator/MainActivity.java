package e.arif.caloriecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //CalorieCalculator calculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void setContentsOfTextView(int id, String newContents) {
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }

    private String getItemSelected(int id) {
        View view = findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;
    }

    public void calculateCalorieButtonClicked(View view) {
        String age = getItemSelected(R.id.ageSpinner);
        String sex = getItemSelected(R.id.sexSpinner);
        String activity = getItemSelected(R.id.activitySpinner);
        CalorieCalculator calculator = new CalorieCalculator();
        int calorie = calculator.getCalorie(age, sex, activity);
        double carbohydrate = calculator.getCarb(calorie);
        double protein = calculator.getProtein(calorie);
        double fat = calculator.getFat(calorie);
        setContentsOfTextView(R.id.display, "Total calorie requirement is: \n" + calorie + " Kcal/Day \n" +
                "[Carbohydrate : " + String.format("%.2f", carbohydrate) + " grams \n" +
                "Protein : " + String.format("%.2f", protein) + " grams \n" +
                "Fat : " + String.format("%.2f", fat) + " grams]");
    }
}
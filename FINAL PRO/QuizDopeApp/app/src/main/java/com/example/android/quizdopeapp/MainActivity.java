package com.example.android.quizdopeapp;

/**
 * Let's import all the things we need.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.android.quizdopeapp.R.id.radio_question1_choice1;
import static com.example.android.quizdopeapp.R.id.radio_question1_choice2;
import static com.example.android.quizdopeapp.R.id.radio_question5_choice1;
import static com.example.android.quizdopeapp.R.id.radio_question5_choice2;
import static com.example.android.quizdopeapp.R.id.radio_question5_choice3;

/**
 * This app tests the extent of someone's brainiac index and gives them a score out of 7.
 */
public class MainActivity extends AppCompatActivity {

    int score_of_question1;
    int score_of_question5;
    int score_of_question2_3_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when RadioButtons are clicked to calculate the score of question1,5.
     */
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        RadioButton q1_choice1 = (RadioButton) findViewById(radio_question1_choice1);
        boolean q1_c1 = q1_choice1.isChecked();

        RadioButton q1_choice2 = (RadioButton) findViewById(radio_question1_choice2);
        boolean q1_c2 = q1_choice2.isChecked();

        RadioButton q5_choice1 = (RadioButton) findViewById(radio_question5_choice1);
        boolean q5_c1 = q5_choice1.isChecked();

        RadioButton q5_choice2 = (RadioButton) findViewById(radio_question5_choice2);
        boolean q5_c2 = q5_choice2.isChecked();

        RadioButton q5_choice3 = (RadioButton) findViewById(radio_question5_choice3);
        boolean q5_c3 = q5_choice3.isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case radio_question1_choice1:
                if (q1_c1)
                    score_of_question1++;
                q1_choice1.setClickable(false);
                break;
            case radio_question1_choice2:
                if (q1_c2 && score_of_question1 > 0)
                    score_of_question1 = score_of_question1 - 1;
                if (q1_c2 && score_of_question1 == 0)
                    q1_choice1.setClickable(true);
                break;
            case radio_question5_choice1:
                if (q5_c1)
                    score_of_question5++;
                q5_choice1.setClickable(false);
                break;
            case radio_question5_choice2:
                if (q5_c2 && score_of_question5 > 0)
                    score_of_question5 = score_of_question5 - 1;
                if (q5_c2 && score_of_question5 == 0)
                    q5_choice1.setClickable(true);
                break;
            case radio_question5_choice3:
                if (q5_c3 && score_of_question5 > 0)
                    score_of_question5 = score_of_question5 - 1;
                if (q5_c3 && score_of_question5 == 0)
                    q5_choice1.setClickable(true);
                break;

        }
    }

    /**
     * This method is called to calculate the score of question2,3,4.
     */
    private int calculateScore(boolean first_checkbox, boolean second_checkbox, boolean third_checkbox, String first_answer_field, String second_answer_field) {

        if (first_checkbox && second_checkbox && !third_checkbox) {
            score_of_question2_3_4++;
        }
        if (first_answer_field.equals("TIT FOR TAT")) {
            score_of_question2_3_4++;
        }
        if (second_answer_field.equals("NONE")) {
            score_of_question2_3_4++;
        }
        // Calculate the total score
        return score_of_question2_3_4;
    }

    /**
     * This method is called when the submit button is clicked.
     */
    public void submitTest(View view) {
        // Get user's name
        EditText nameField = (EditText) findViewById(R.id.name_field);
        Editable nameEditable = nameField.getText();
        String name = nameEditable.toString();
        nameField.getText().clear();

        // Get text's answers
        EditText question2 = (EditText) findViewById(R.id.question2);
        Editable qEditable = question2.getText();
        String q2 = qEditable.toString();
        q2 = q2.trim();
        question2.getText().clear();

        EditText question4 = (EditText) findViewById(R.id.question4);
        Editable qEditable2 = question4.getText();
        String q4 = qEditable2.toString();
        q4 = q4.trim();
        question4.getText().clear();

        // Figure out which answer the test-taker chooses
        CheckBox checkbox_question3_choice1 = (CheckBox) findViewById(R.id.checkbox_question3_choice1);
        boolean q3_c1 = checkbox_question3_choice1.isChecked();
        checkbox_question3_choice1.setChecked(false);

        CheckBox checkbox_question3_choice2 = (CheckBox) findViewById(R.id.checkbox_question3_choice2);
        boolean q3_c2 = checkbox_question3_choice2.isChecked();
        checkbox_question3_choice2.setChecked(false);

        CheckBox checkbox_question3_choice3 = (CheckBox) findViewById(R.id.checkbox_question3_choice3);
        boolean q3_c3 = checkbox_question3_choice3.isChecked();
        checkbox_question3_choice3.setChecked(false);

        // Calculate the total score
        calculateScore(q3_c1, q3_c2, q3_c3, q2, q4);

        // Display the test result in Toast Message on the screen
        String message = createTestResult(name);
        Toast.makeText(MainActivity.this,
                message, Toast.LENGTH_LONG).show();
    }

    /**
     * This method is called to create the content for the test result displayed in Toast Message.
     */
    private String createTestResult(String name) {

        int totalscore = score_of_question1 + score_of_question2_3_4 + score_of_question5;
        String TestResult = getString(R.string.test_taker_name, name);
        if (totalscore == 5) {
            TestResult += "\n" + "Congratulations!" + "\n" + "Brainiac Alert!" + "\n" + "You have a perfect score of 5";
        } else {
            TestResult += "\n" + "your total score is " + totalscore + " out of 5";
        }
        score_of_question1 = 0;
        score_of_question2_3_4 = 0;
        score_of_question5 = 0;
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup1);
        radioGroup.clearCheck();
        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.radiogroup2);
        radioGroup2.clearCheck();
        RadioButton q1_choice1 = (RadioButton) findViewById(radio_question1_choice1);
        q1_choice1.setClickable(true);
        RadioButton q5_choice1 = (RadioButton) findViewById(radio_question5_choice1);
        q5_choice1.setClickable(true);
        return TestResult;

    }
}





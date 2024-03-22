package com.example.myimadpr1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaring all values
        val edAge = findViewById<EditText>(R.id.edAge)
        val button2 = findViewById<Button>(R.id.button2)
        val button1GH = findViewById<Button>(R.id.button1GH)
        val response = findViewById<TextView>(R.id.response)

        //code to ensure the clear button clears the input and the output
        button2.setOnClickListener {
            edAge.text.clear()
            response.text = ""
        }

        // code to make the generate button display information based on the input
        button1GH.setOnClickListener {

            // Convert edAge input number to an integer
            val text = edAge.text.toString().toIntOrNull()

            // Check if the edAge input is a valid integer
            if (text != null) {
                // Check if the age falls within range
                if (text in 20..29) {
                    // If the age is in range, send answer message to the response box
                    response.text = "25 - Tupac Shakur\n " +
                            // Using the n to ensure the names are on a separate line to the rest of the info.
                            // Also Shakur is spelt correctly.
                            " September 13, 1996 at the young age of only 25, Tupac Shakur lost his life.\n " +
                            "2Pac was an American Rapper and actor, having sold over 75 million records worldwide, making him one of the best-selling music artists of all time." +
                            "Shakur even made it into the Rock and Roll Hall of Fame in his first year of eligibility.\n" +
                            "2Pac was and still is a massive inspiration among youth and to this day still manages to make an impact on all those who comes across him. "
                } else if (text in 30..39) {
                    response.text = "36 - Princess Diana\n" +
                            "Diana, Princess of Wales, tragically died in a car accident at the age of just 36 years old in 1997.\n" +
                            "Born Diana Frances Spencer, was a member of the British Royal family having married, then, Prince Charles III and" +
                            "mother to Prince William and Harry. Diana never ceased to continuously wear her heart on her sleeve through her activism, kindness and charity work." +
                            "To this day, Diana is still one of the greatest icons and the people's favourite Princess."
                } else if (text in 40..49) {
                    response.text = "48 - Whitney Houston\n" +
                            "Known as 'the Voice', Whitney tragically died due to an accidental drowning influenced by substance abuse, at the age of 48 in 2012.\n" +
                            "With over 220 million records sold worldwide, Houston is regarded as one of the greatest singers in the history of music as well as one of the best-selling artists of all time." +
                            "Whitney Elizabeth Houston was an American singer and actress, whose work still lives on to this day."
                } else if (text in 50..59) {
                    response.text = "57 - Prince\n" +
                            "This multi-talented artist, passed away at 57 years old in 2016 after being hospitalized with the flu.\n" +
                            "Famous for the hit song and film, Purple Rain, Prince Rogers Nelson was a singer, songwriter, musician, record producer, dancer and actor.He received numerous awards and nominations" +
                            "and is still regarded as one of the greatest musicians of his generation."
                } else if (text in 60..69) {
                    response.text = "63 - Audrey Hepburn\n" +
                            "Audrey Hepburn, british actress and fashion icon, passed away in 1993 at 63 years old\n" +
                            "Audrey was ranked 3rd greatest female screen legend by the American Film Institute." +
                            "Not only that, she was also inducted into the International Best Dressed Hall of Fame List. Hepburn's legacy still lives on to this day through her iconic fashion and captivating acting roles."
                } else if (text in 70..79) {
                    response.text = "74 - Muhammad Ali\n" +
                            "One of the most famous in the boxing industry, Muhammad Ali, died at the age of 74 in 2016.\n" +
                            "Ali was not a humble boxer, having declared himself 'the greatest' after beating one of his biggest rivals, Sonny Liston. After refusing to go to Vietnam after being drafted" +
                            ", Muhammed Ali had to fight his way back into the boxing ring by appealing the court. Ali retired in 1981 and was diagnosed with Parkinson's Disease." +
                            "His legacy lives on through his 9 children and his iconic career."
                } else if (text in 80..89) {
                    response.text = "81 - Winnie Mandela\n" +
                            "Having died in 2018 at the age of 81, Winnie was more that just Nelson Mandela's husband, She was a South African anti-apartheid activist and Politician" +
                            "She was a Member of Parliament from 1994-2003 and again from 2009 to her death. Winnie and her husband made a change in history that will not be forgotten. "
                } else if (text in 90..99) {
                    response.text = "99 - Betty White\n" +
                            "Betty white tragically passed away just 11 days away from her 100th birthday at the age of 99.\n" +
                            "White passed away in December 2021, due to a stroke she suffered the week before her death. Betty had an extraordinary long career in Hollywood, with many hits over the years." +
                            "Betty had a very giving nature that showed even after her death, with her fans having helped raise over $12.7 million in a charity drive towards her favourite cause - Animal Welfare."
                } else {
                    // If the input is not a valid integer or within one of the age ranges,the following error message will be displayed
                    response.text = "Please enter a valid age within the range of 20yrs - 100yrs."
                }
            }
        }
    }
}
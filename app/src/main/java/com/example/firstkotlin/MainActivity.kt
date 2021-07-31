package com.example.firstkotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.mariuszgromada.math.mxparser.Expression
import javax.xml.xpath.XPathExpression

class MainActivity : AppCompatActivity() {

    private fun removeLastChar(str: String): String? {
        var str = str
        if (str.length > 0)
            str = str.substring(0, str.length - 1)
        return str
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button0 = findViewById<Button>(R.id.zero_B)
        val button1 = findViewById<Button>(R.id.one_B)
        val button2 = findViewById<Button>(R.id.two_B)
        val button3 = findViewById<Button>(R.id.tree_B)
        val button4 = findViewById<Button>(R.id.four_B)
        val button5 = findViewById<Button>(R.id.five_B)
        val button6 = findViewById<Button>(R.id.six_B)
        val button7 = findViewById<Button>(R.id.seven_B)
        val button8 = findViewById<Button>(R.id.eight_B)
        val button9 = findViewById<Button>(R.id.nine_B)
        val button_point = findViewById<Button>(R.id.point_B)
        val button_equal = findViewById<Button>(R.id.equal_B)
        val button_multiply = findViewById<Button>(R.id.multiply_B)
        val button_submission = findViewById<Button>(R.id.submission_B)
        val button_plus = findViewById<Button>(R.id.plus_B)
        val button_divide = findViewById<Button>(R.id.divide_B)
        val button_radical = findViewById<Button>(R.id.Radical_B)
        val button_off = findViewById<Button>(R.id.off_B)
        val button_clear = findViewById<Button>(R.id.clear_B)
        val button_sin = findViewById<Button>(R.id.Sin_B)
        val button_cos = findViewById<Button>(R.id.cos_B)
        val button_tan = findViewById<Button>(R.id.tan_B)
        val button_right_braces = findViewById<Button>(R.id.bracesRight_B)
        val button_left_braces = findViewById<Button>(R.id.bracesLeft_B)
        val button_fact = findViewById<Button>(R.id.factoriel)
        val button_delete = findViewById<Button>(R.id.Delete_B)
        val button_power = findViewById<Button>(R.id.power_B)
        val LCD_panel = findViewById<TextView>(R.id.LCD)
        val LCD_panel2 = findViewById<TextView>(R.id.BackLCD)

        button0.setOnClickListener {
            LCD_panel.text = LCD_panel.text.toString() + "0"
            LCD_panel2.text = LCD_panel2.text.toString() + "0"
        }
        button1.setOnClickListener {
            LCD_panel.text = LCD_panel.text.toString() + "1"
            LCD_panel2.text = LCD_panel2.text.toString() + "1"
        }
        button2.setOnClickListener {
            LCD_panel.text = LCD_panel.text.toString() + "2"
            LCD_panel2.text = LCD_panel2.text.toString() + "2"
        }
        button3.setOnClickListener(View.OnClickListener {
            LCD_panel.text = LCD_panel.text.toString() + "3"
            LCD_panel2.text = LCD_panel2.text.toString() + "3"

        })
        button4.setOnClickListener(View.OnClickListener {
            LCD_panel.text = LCD_panel.text.toString() + "4"
            LCD_panel2.text = LCD_panel2.text.toString() + "4"

        })
        button5.setOnClickListener(View.OnClickListener {
            LCD_panel.text = LCD_panel.text.toString() + "5"
            LCD_panel2.text = LCD_panel2.text.toString() + "5"

        })
        button6.setOnClickListener(View.OnClickListener {
            LCD_panel.text = LCD_panel.text.toString() + "6"
            LCD_panel2.text = LCD_panel2.text.toString() + "6"

        })
        button7.setOnClickListener(View.OnClickListener {
            LCD_panel.text = LCD_panel.text.toString() + "7"
            LCD_panel2.text = LCD_panel2.text.toString() + "7"

        })
        button8.setOnClickListener(View.OnClickListener {
            LCD_panel.text = LCD_panel.text.toString() + "8"
            LCD_panel2.text = LCD_panel2.text.toString() + "8"

        })
        button9.setOnClickListener(View.OnClickListener {
            LCD_panel.text = LCD_panel.text.toString() + "9"
            LCD_panel2.text = LCD_panel2.text.toString() + "9"

        })
        button_plus.setOnClickListener {
            LCD_panel.text = LCD_panel.text.toString() + "+"
            LCD_panel2.text = LCD_panel2.text.toString() + "+"

        }
        button_submission.setOnClickListener {
            LCD_panel.text = LCD_panel.text.toString() + "-"
            LCD_panel2.text = LCD_panel2.text.toString() + "-"

        }
        button_multiply.setOnClickListener {
            LCD_panel.text = LCD_panel.text.toString() + "×"
            LCD_panel2.text = LCD_panel2.text.toString() + "*"

        }
        button_divide.setOnClickListener {
            LCD_panel.text = LCD_panel.text.toString() + "÷"
            LCD_panel2.text = LCD_panel2.text.toString() + "/"

        }

        button_equal.setOnClickListener {
            LCD_panel.text = LCD_panel.text


            val MathSen = LCD_panel2.text.toString()

            val e = Expression(MathSen)
            val result: String = java.lang.String.valueOf(e.calculate())
            LCD_panel.text = null
            LCD_panel.text = result

        }
        button_point.setOnClickListener {
            LCD_panel.text = LCD_panel.text.toString() + "."
            LCD_panel2.text = LCD_panel2.text.toString() + "."
        }
        button_power.setOnClickListener {
            LCD_panel.text = LCD_panel.text.toString() + "^"
            LCD_panel2.text = LCD_panel2.text.toString() + "^"

        }
        button_off.setOnClickListener { finish() }
        button_clear.setOnClickListener {
            LCD_panel.text = null
            LCD_panel2.text = null
        }
        button_sin.setOnClickListener {
            LCD_panel.text = LCD_panel.text.toString() + "sin("
            LCD_panel2.text = LCD_panel2.text.toString() + "sin("

        }
        button_cos.setOnClickListener {
            LCD_panel.text = LCD_panel.text.toString() + "cos("
            LCD_panel2.text = LCD_panel2.text.toString() + "cos("

        }
        button_tan.setOnClickListener {
            LCD_panel.text = LCD_panel.text.toString() + "tan("
            LCD_panel2.text = LCD_panel2.text.toString() + "tan("

        }
        button_fact.setOnClickListener {
            LCD_panel.text = LCD_panel.text.toString() + "!"
            LCD_panel2.text = LCD_panel2.text.toString() + "!"

        }
        button_radical.setOnClickListener {
            LCD_panel.text = LCD_panel.text.toString() + "√("
            LCD_panel2.text = LCD_panel2.text.toString() + "sqrt("

        }
        button_right_braces.setOnClickListener {
            LCD_panel.text = LCD_panel.text.toString() + ")"
            LCD_panel2.text = LCD_panel2.text.toString() + ")"

        }
        button_left_braces.setOnClickListener {
            LCD_panel.text = LCD_panel.text.toString() + "("
            LCD_panel2.text = LCD_panel2.text.toString() + "("

        }
        button_delete.setOnClickListener {
            LCD_panel.setText(removeLastChar(LCD_panel.text.toString()))
            LCD_panel2.setText(removeLastChar(LCD_panel2.text.toString()))
        }


    }
}
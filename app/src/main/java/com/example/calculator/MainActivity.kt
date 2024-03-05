package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText



class MainActivity : AppCompatActivity() {
    private lateinit var mButton0: Button
    private lateinit var mButton1: Button
    private lateinit var mButton2: Button
    private lateinit var mButton3: Button
    private lateinit var mButton4: Button
    private lateinit var mButton5: Button
    private lateinit var mButton6: Button
    private lateinit var mButton7: Button
    private lateinit var mButton8: Button
    private lateinit var mButton9: Button
    private lateinit var mButtonPoint: Button
    private lateinit var mButtonAdd: Button
    private lateinit var mButtonSub: Button
    private lateinit var mButtonDiv: Button
    private lateinit var mButtonProc: Button
    private lateinit var mButtonLn: Button
    private lateinit var mButtonPi: Button
    private lateinit var mButtonMul: Button
    private lateinit var mButtonEq: Button
    private lateinit var mButtonClear: Button
    private lateinit var mEditText: EditText
    private var mValueOne = 0f
    private var mValueTwo = 0f
    private var mAddition = false
    private var mSubtract = false
    private var mMultiplication = false
    private var mDivision = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mButton0 = findViewById(R.id.button0)
        mButton1 = findViewById(R.id.button1)
        mButton2 = findViewById(R.id.button2)
        mButton3 = findViewById(R.id.button3)
        mButton4 = findViewById(R.id.button4)
        mButton5 = findViewById(R.id.button5)
        mButton6 = findViewById(R.id.button6)
        mButton7 = findViewById(R.id.button7)
        mButton8 = findViewById(R.id.button8)
        mButton9 = findViewById(R.id.button9)
        mButtonPoint = findViewById(R.id.buttonPoint)
        mButtonAdd = findViewById(R.id.buttonAdd)
        mButtonSub = findViewById(R.id.buttonSub)
        mButtonMul = findViewById(R.id.buttonMul)
        mButtonDiv = findViewById(R.id.buttonDiv)
        mButtonProc = findViewById(R.id.buttonProc)
        mButtonLn = findViewById(R.id.buttonLn)
        mButtonPi = findViewById(R.id.buttonPi)
        mButtonEq = findViewById(R.id.buttonEq)
        mButtonClear = findViewById(R.id.buttonClear)
        mEditText = findViewById(R.id.editText1)

        mButton1.setOnClickListener {
            mEditText.setText(mEditText.text.toString() + "1")
        }

        mButton2.setOnClickListener {
            mEditText.setText(mEditText.text.toString() + "2")
        }

        mButton3.setOnClickListener {
            mEditText.setText(mEditText.text.toString() + "3")
        }

        mButton4.setOnClickListener {
            mEditText.setText(mEditText.text.toString() + "4")
        }

        mButton5.setOnClickListener {
            mEditText.setText(mEditText.text.toString() + "5")
        }

        mButton6.setOnClickListener {
            mEditText.setText(mEditText.text.toString() + "6")
        }

        mButton7.setOnClickListener {
            mEditText.setText(mEditText.text.toString() + "7")
        }

        mButton8.setOnClickListener {
            mEditText.setText(mEditText.text.toString() + "8")
        }

        mButton9.setOnClickListener {
            mEditText.setText(mEditText.text.toString() + "9")
        }

        mButton0.setOnClickListener {
            mEditText.setText(mEditText.text.toString() + "0")
        }

        mButtonAdd.setOnClickListener {
            if (mEditText.text != null) {
                mValueOne = mEditText.text.toString().toFloat()
                mAddition = true
                mEditText.setText(mEditText.text.toString() + " + ")
            }
        }

        mButtonSub.setOnClickListener {
            if (mEditText.text != null) {
                mValueOne = mEditText.text.toString().toFloat()
                mSubtract = true
                mEditText.setText(mEditText.text.toString() + " - ")
            }
        }

        mButtonMul.setOnClickListener {
            if (mEditText.text != null) {
                mValueOne = mEditText.text.toString().toFloat()
                mMultiplication = true
                mEditText.setText(mEditText.text.toString() + " * ")
            }
        }

        mButtonDiv.setOnClickListener {
            if (mEditText.text != null) {
                mValueOne = mEditText.text.toString().toFloat()
                mDivision = true
                mEditText.setText(mEditText.text.toString() + " / ")
            }
        }

        mButtonPoint.setOnClickListener {
            mEditText.setText(mEditText.text.toString() + ".")
        }

        mButtonProc.setOnClickListener {
            if (mEditText.text != null) {
                val value = mEditText.text.toString().toFloat() / 100
                mEditText.setText(value.toString())
            }
        }

        mButtonPi.setOnClickListener {
            val pi = Math.PI
            mEditText.setText(mEditText.text.toString() + pi.toString())
        }

        mButtonLn.setOnClickListener {
            if (mEditText.text != null) {
                val value = mEditText.text.toString().toFloat()
                val result = Math.log(value.toDouble())
                mEditText.setText(mEditText.text.toString() + "ln($value) = " + result.toString())
            }
        }


        mButtonEq.setOnClickListener {
            try {
                mValueTwo = mEditText.text.toString().toFloat()
                if (mAddition) {
                    mEditText.setText((mValueOne + mValueTwo).toString())
                    mAddition = false
                }
                if (mSubtract) {
                    mEditText.setText((mValueOne - mValueTwo).toString())
                    mSubtract = false
                }
                if (mMultiplication) {
                    mEditText.setText((mValueOne * mValueTwo).toString())
                    mMultiplication = false
                }
                if (mDivision) {
                    mEditText.setText((mValueOne / mValueTwo).toString())
                    mDivision = false
                }
            } catch (e: NumberFormatException) {
                // Обработка ошибки преобразования строки в число
                mEditText.setText("Error")
            }
        }

        mButtonClear.setOnClickListener {
            mEditText.setText("") // Установка текста в пустую строку
        }


    }
}

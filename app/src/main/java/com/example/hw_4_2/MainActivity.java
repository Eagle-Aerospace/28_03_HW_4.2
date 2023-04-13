package com.example.hw_4_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Поля ввода
    private EditText trainIn; // поезд №
    private EditText placeIn; // Пункт отправления - пункт прибытия
    private EditText departureDateIn;
    private EditText departureTimeIn;
    private EditText arrivalDateIn;
    private EditText arrivalTimeIn;
    private EditText railwayCarriageIn;
    private EditText seatIn;
    private EditText passengerIn; // ФИО пасажира
    private EditText priceIn;


//    private Button button;

    private String train;
    private String place;
    private String departureDate;
    private String departureTime;
    private String arrivalDate;
    private String arrivalTime;
    private String railwayCarriage;
    private String seat;
    private String passenger;
    private String price;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //привязка к полям по id
        trainIn = findViewById(R.id.trainIn);
        placeIn = findViewById(R.id.placeIn);
        departureDateIn = findViewById(R.id.departureDateIn);
        departureTimeIn = findViewById(R.id.departureTimeIn);
        arrivalDateIn = findViewById(R.id.arrivalDateIn);
        arrivalTimeIn = findViewById(R.id.arrivalTimeIn);
        railwayCarriageIn = findViewById(R.id.railwayCarriageIn);
        seatIn = findViewById(R.id.seatIn);
        passengerIn = findViewById(R.id.passengerIn);
        priceIn = findViewById(R.id.priceIn);

        //обработка нажатия кнопки
//        button.setOnClickListener(listener);
    }

    public void onClick(View view) {
        //переключение на другой экран и передача данных

        //считывание данных с экрана
        train = trainIn.getText().toString();
        place = placeIn.getText().toString();
        departureDate = departureDateIn.getText().toString();
        departureTime = departureTimeIn.getText().toString();
        arrivalDate = arrivalDateIn.getText().toString();
        arrivalTime = arrivalTimeIn.getText().toString();
        railwayCarriage = railwayCarriageIn.getText().toString();
        seat = seatIn.getText().toString();
        passenger = passengerIn.getText().toString();
        price = priceIn.getText().toString();

        //создадим объект нашей сущности и через конструктор инициализируем его
        Ticket ticket = new Ticket(train, place, departureDate, departureTime,
                arrivalDate, arrivalTime, railwayCarriage, seat, passenger, price);

        //Создание намерения
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        //запаковка данных в контейнер намерения
        intent.putExtra(Ticket.class.getSimpleName(), ticket);
        //старт переклчения активности и передача данных
        startActivity(intent);

    }

//    private View.OnClickListener listener = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            //переключение на друго экран и передача данных
//
//            //считывание данных с экрана
//            train = trainIn.getText().toString();
//            passenger = passengerIn.getText().toString();
//
//            //создадим объект нашей сущности и через конструктор инициализируем его
//            Ticket ticket = new Ticket(train, passenger);
//
//            //Создание намерения
//            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
//            //запаковка данных в контейнер намерения
//            intent.putExtra(Ticket.class.getSimpleName(), ticket);
//            //старт переклчения активности и передача данных
//            startActivity(intent);
//
//
//        }
//    };
}
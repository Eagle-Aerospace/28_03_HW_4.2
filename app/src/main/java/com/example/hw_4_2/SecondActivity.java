package com.example.hw_4_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    // создание полей
    private TextView dataMainActivity; // поле вывода информации из главной активити
    private Button newOrderButton; // кнопка переключения на главную активити
    private Ticket ticket; // поле сущности пользователя

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // привязка id к полю
        dataMainActivity = findViewById(R.id.dataUser);
        newOrderButton = findViewById(R.id.newOrderButton);

        // считывание данных из главной активити
        Bundle bundleIntent = getIntent().getExtras();

        if (bundleIntent != null) { // если в данном контейнере что-то есть, то

            // инициализация поля сущности пользователя
            ticket = (Ticket) bundleIntent.getSerializable(Ticket.class.getSimpleName());

            // вывод на экран данных из главной активити
            dataMainActivity.setText("Номер поезда: №" + ticket.getTrain() + "\n"
                    + "Пункт отправления - пункт прибытия: "+ ticket.getPlace() + "\n" + "\n"
                    + "Дата отправления: "+ ticket.getDepartureDate() + "\n" + "Время: " + ticket.getDepartureTime() + "\n"
                    + "Дата прибытия: "+ ticket.getArrivalDate() + "\n" + "Время: " + ticket.getArrivalTime() + "\n"
                    + "Вагон № "+ ticket.getRailwayCarriage() + " Место: " + ticket.getSeat() + "\n" + "\n"
                    + "Стоимость билета: "+ ticket.getPrice() + "руб." + "\n"
                    + "Пасажир: "+ ticket.getPassenger());
        }

        // обработка нажатия кнопки
        newOrderButton.setOnClickListener(listener);
    }

    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // переключение на другой экран
            Intent intent = new Intent(getApplicationContext(), MainActivity.class); // создание намерения переключения на другой экран
            startActivity(intent); // запуск дополнительной активити через намерение
        }
    };
}
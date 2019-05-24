package com.example.i_ridemessenger.Fragments;

import com.example.i_ridemessenger.Notification.MyResponse;
import com.example.i_ridemessenger.Notification.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIServices {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA15Metbo:APA91bHR1uyIPzU54qNvFEZBpO52_a22Tlc0Zo30nom7PPubHT6i7QsXt5tarZaVY6RT1OW1s9krIW0TgquLRshR4xhfX9QavuqXI_gMhQnrq7qbwTvmUZkFpVK4HltFG7gDCeYyKQ8d"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
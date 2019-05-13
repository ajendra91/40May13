package com.example.ReviceAjax;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmpRes<T> {

    public T data;
    public String status;
}

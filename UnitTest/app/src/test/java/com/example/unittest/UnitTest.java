package com.example.unittest;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

public class UnitTest {
    @Test
    public void Test1() {
        String Email = "gmail.ru";
        Assert.assertThat(String.format("Email введен некорректно: %s ", Email), Proverki.ProverkaEmailValid(Email), is(true));
    }

    @Test
    public void Test2() {
        String Email = "plesenta@gmail.ru";
        Assert.assertThat(String.format("Email введен корректно: %s ", Email), Proverki.ProverkaEmailValid(Email), is(true));
    }

    @Test
    public void Test3() {
        String Password = "DA123";
        Assert.assertThat(String.format("Пароль введен некорректно: %s ", Password), Proverki.ProverkaPasswordValid(Password), is(true));
    }


    @Test
    public void Test4() {
        String Password = "gggDA12%3";
        Assert.assertThat(String.format("Пароль введен корректно: %s", Password), Proverki.ProverkaPasswordValid(Password), is(true));
    }

    @Test
    public void Test5() {
        String Email = "plesenta@";
        String Password = "DA12%3";
        if(Proverki.ProverkaEmailValid(Email) && Proverki.ProverkaPasswordValid(Password)){
            Assert.assertTrue("Валидация завершена",true);
        }
        else{
            Assert.assertTrue("Валидация не пройдена! Введены некорректные данные.",false);
        }
    }

    @Test
    public void Test6() {
        String Email = "plesenta@gmail.ru";
        String Password = "gggDA12%3";
        if(Proverki.ProverkaEmailValid(Email) && Proverki.ProverkaPasswordValid(Password)){
            Assert.assertTrue("Валидация завершена",true);
        }
        else{
            Assert.assertTrue("Валидация не пройдена! Введены некорректные данные.",false);
        }
    }
}

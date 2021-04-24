package by.epamtc.task4.service;

import by.epamtc.exeptions.NullStringException;

public interface DeleteService {
    String deleteNonLetters(String text) throws NullStringException;
}

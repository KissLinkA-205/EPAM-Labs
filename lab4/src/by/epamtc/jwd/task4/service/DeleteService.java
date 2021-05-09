package by.epamtc.jwd.task4.service;

import by.epamtc.jwd.exeptions.NullStringException;

public interface DeleteService {
    String deleteNonLetters(String text) throws NullStringException;
}

package by.epamtc.task3.service;

import by.epamtc.exeptions.NullStringException;

public interface ReplacementService {
    String replaceWords(String text, int length, String substring) throws NullStringException;
}

package by.epamtc.jwd.task3.service;

import by.epamtc.jwd.exeptions.NullStringException;

public interface ReplacementService {
    String replaceWords(String text, int length, String substring) throws NullStringException;
}

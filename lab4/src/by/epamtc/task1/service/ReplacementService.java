package by.epamtc.task1.service;

import by.epamtc.exeptions.NullStringException;

public interface ReplacementService {
    String replaceLetter(String text, int numberOfLetter, char letter) throws NullStringException;
}

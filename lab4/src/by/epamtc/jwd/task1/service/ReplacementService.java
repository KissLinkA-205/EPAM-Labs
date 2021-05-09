package by.epamtc.jwd.task1.service;

import by.epamtc.jwd.exeptions.NullStringException;

public interface ReplacementService {
    String replaceLetter(String text, int numberOfLetter, char letter) throws NullStringException;
}

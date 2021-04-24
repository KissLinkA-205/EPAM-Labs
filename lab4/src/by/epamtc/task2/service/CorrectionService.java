package by.epamtc.task2.service;

import by.epamtc.exeptions.NullStringException;

public interface CorrectionService {
    String correctLetter(String text) throws NullStringException;
}

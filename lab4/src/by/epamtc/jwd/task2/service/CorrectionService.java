package by.epamtc.jwd.task2.service;

import by.epamtc.jwd.exeptions.NullStringException;

public interface CorrectionService {
    String correctLetter(String text) throws NullStringException;
}

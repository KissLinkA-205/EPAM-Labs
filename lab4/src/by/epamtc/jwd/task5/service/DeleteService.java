package by.epamtc.jwd.task5.service;

import by.epamtc.jwd.exeptions.NullStringException;

public interface DeleteService {
    String deleteConsonantWords(String text, int length) throws NullStringException;
}

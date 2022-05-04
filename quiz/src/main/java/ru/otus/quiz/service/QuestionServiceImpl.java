package ru.otus.quiz.service;

import org.springframework.stereotype.Service;
import ru.otus.quiz.dao.QuestionDao;
import ru.otus.quiz.domain.Question;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService{
    private final QuestionDao dao;

    public QuestionServiceImpl(QuestionDao dao) {
        this.dao = dao;
    }

    public List<Question> getAllQuestions() {
        return dao.getAll();
    }
}
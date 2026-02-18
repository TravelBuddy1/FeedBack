package tn.esprit.feedback.services;

import tn.esprit.feedback.entities.Feedback;

import java.util.List;

public interface IFeedbackService {
    Feedback addFeedback(Feedback feedback);

    List<Feedback> getFeedbackByTrip(Long tripId);

    List<Feedback> getAllFeedback();
}

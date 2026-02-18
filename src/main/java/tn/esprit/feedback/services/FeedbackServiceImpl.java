package tn.esprit.feedback.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.feedback.entities.Feedback;
import tn.esprit.feedback.repositories.FeedbackRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class FeedbackServiceImpl implements IFeedbackService{
    private final FeedbackRepository feedbackRepository;

    @Override
    public Feedback addFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    @Override
    public List<Feedback> getFeedbackByTrip(Long tripId) {
        return feedbackRepository.findByTripId(tripId);
    }

    @Override
    public List<Feedback> getAllFeedback() {
        return feedbackRepository.findAll();
    }
}

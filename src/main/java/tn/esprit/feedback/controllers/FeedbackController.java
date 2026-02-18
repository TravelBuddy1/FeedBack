package tn.esprit.feedback.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.feedback.entities.Feedback;
import tn.esprit.feedback.services.IFeedbackService;

import java.util.List;

@RestController
@RequestMapping("/api/feedback")
@RequiredArgsConstructor
public class FeedbackController {
    private final IFeedbackService feedbackService;

    @PostMapping
    public Feedback addFeedback(@RequestBody Feedback feedback) {
        return feedbackService.addFeedback(feedback);
    }

    @GetMapping("/trip/{tripId}")
    public List<Feedback> getByTrip(@PathVariable Long tripId) {
        return feedbackService.getFeedbackByTrip(tripId);
    }

    @GetMapping
    public List<Feedback> getAll() {
        return feedbackService.getAllFeedback();
    }
}

package ro.ieti.studbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.ieti.studbank.service.NoticeService;

@RestController
public class NoticesController {
    @Autowired
    private NoticeService noticeService;

    @GetMapping("/notices")
    public ResponseEntity getNotices() {
        return noticeService.getNotice();
    }
}

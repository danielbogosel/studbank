package ro.ieti.studbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ro.ieti.studbank.model.Notice;
import ro.ieti.studbank.repository.NoticeRepository;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class NoticeService {

    @Autowired
    private NoticeRepository noticeRepository;

    public ResponseEntity getNotice() {
        List<Notice> notices = noticeRepository.findAll();
        if (notices != null) {
            return ResponseEntity.ok()
                    .cacheControl(CacheControl.maxAge(60, TimeUnit.SECONDS))
                    .body(notices);
        } else {
            return null;
        }
    }
}

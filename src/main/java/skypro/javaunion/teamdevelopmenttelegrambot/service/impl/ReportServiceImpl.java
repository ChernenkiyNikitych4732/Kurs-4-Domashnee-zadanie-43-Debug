package skypro.javaunion.teamdevelopmenttelegrambot.service.impl;

import org.springframework.stereotype.Service;
import skypro.javaunion.teamdevelopmenttelegrambot.constants.StatusReport;
import skypro.javaunion.teamdevelopmenttelegrambot.model.Report;
import skypro.javaunion.teamdevelopmenttelegrambot.model.User;
import skypro.javaunion.teamdevelopmenttelegrambot.service.ReportService;

import java.time.LocalDate;
import java.util.Collection;

@Service
public class ReportServiceImpl implements ReportService {
    @Override
    public Report saveReport(User userId, LocalDate dateReport, StatusReport statusReport, String textReport, byte[] picture) {
        return null;
    }

    @Override
    public void updateReportByUserId(User userId, LocalDate dateReport, StatusReport statusReport, String textReport, byte[] picture) {

    }

    @Override
    public void updateDateEndOfProbationById(User userId, LocalDate dateEndOfProbation) {

    }

    @Override
    public void updateStatusReportById(User userId, StatusReport statusReport) {

    }

    @Override
    public void deleteReportById(Long id) {

    }

    @Override
    public Collection<Report> getAllReport() {
        return null;
    }
}

package pl.kul.cinemix.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.kul.cinemix.dto.entity.ScreeningDto;
import pl.kul.cinemix.models.Screening;
import pl.kul.cinemix.service.ScreeningService;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/screenings")
@RequiredArgsConstructor
public class ScreeningController {

    private final ScreeningService screeningService;


    @GetMapping("/all")
    public List<ScreeningDto> allScreenings() {
        return screeningService.getAllScreenings();
    }

    @GetMapping("/{id}")
    public ScreeningDto getScreening(@PathVariable Long id) {
        return screeningService.getScreening(id);
    }

    @PostMapping("/add")
    //@PreAuthorize("hasRole('ADMIN') or hasRole('MODERATOR')")
    public void addScreening(@RequestBody Screening screening) {
        screeningService.addScreening(screening);
    }

    @PutMapping("/edit")
    //   @PreAuthorize("hasRole('ADMIN') or hasRole('MODERATOR')")
    public void editScreening(@RequestBody Screening screening) {
        screeningService.editScreening(screening);
    }

    @DeleteMapping("/delete/{id}")
    //@PreAuthorize("hasRole('ADMIN') or hasRole('MODERATOR')")
    public void deleteScreening(@PathVariable Long id) {
        screeningService.deleteScreening(id);
    }


}

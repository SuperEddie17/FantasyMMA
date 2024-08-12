package org.avc.controller;


import org.avc.DTO.FighterStatsDTO;
import org.avc.service.FighterStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fighterstats")
public class FighterStatsController {

    @Autowired
    private FighterStatsService fighterStatsService;

    @PostMapping("")
    public FighterStatsDTO newStats(@RequestBody FighterStatsDTO fighterStatsDTO) {
        return fighterStatsService.newFighterStats(fighterStatsDTO);
    }

    @PutMapping("/{statsId}")
    public FighterStatsDTO editStats(@RequestBody FighterStatsDTO fighterStatsDTO, @PathVariable Long statsId) {
    return fighterStatsService.editFighterStats(fighterStatsDTO, statsId);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{statsId}")
    public void deleteStats(@PathVariable Long statsId) {
        fighterStatsService.deleteFighterStats(statsId);
    }

    @GetMapping("/{statsId}")
    public FighterStatsDTO getFighterStats(@PathVariable Long statsId) {
       return fighterStatsService.findFighterStatsById(statsId);
    }

    @PutMapping("/recalculate/{statsId}")
    public FighterStatsDTO recalculateFighterStats(@PathVariable Long statsId) {
        return fighterStatsService.recalculatePoints(statsId);
    }
}

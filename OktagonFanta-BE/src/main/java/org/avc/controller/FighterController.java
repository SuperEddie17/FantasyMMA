package org.avc.controller;

import org.avc.DTO.FighterDTO;
import org.avc.service.FighterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fighters")
public class FighterController {

    @Autowired
    private FighterService fighterService;

    @PostMapping("")
    public FighterDTO newFighter (@RequestBody FighterDTO fighterDTO) {
        return fighterService.newFighter(fighterDTO);
    }

    @PutMapping("/{fighterId}")
    public FighterDTO editFighter (@PathVariable Long fighterId, @RequestBody FighterDTO fighterDTO) {
        return fighterService.editFighter(fighterDTO, fighterId);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{fighterId}")
    public void deleteFighter (@PathVariable Long fighterId) {
        fighterService.deleteFighter(fighterId);
    }

    @GetMapping("/{fighterId}")
    public FighterDTO getFighter (@PathVariable Long fighterId) {
        return fighterService.findFighterById(fighterId);
    }

}

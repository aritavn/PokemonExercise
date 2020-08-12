import { Component, OnInit } from '@angular/core'
import { CatchPokemonsService } from '../../services/catch-pokemons.service'
import { Result } from '../../models/result.model'
import { ActivatedRoute } from '@angular/router'

@Component({
    selector: 'game-result',
    templateUrl: './game-result.component.html'
})
export class GameResultComponent implements OnInit {

    numberOfPokemons: number

    constructor(private catchPokemonsService: CatchPokemonsService, private route: ActivatedRoute) {}
    
    ngOnInit() {
        const directions = this.route.snapshot.paramMap.get('directions');

        this.catchPokemonsService.getGameResult(directions).subscribe((result: Result) => {
            this.numberOfPokemons = result?.numberOfPokemons
        })
    }
}
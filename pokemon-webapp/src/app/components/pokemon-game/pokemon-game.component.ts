import { Component } from '@angular/core'
import { Router } from '@angular/router'

@Component({
    selector: 'pokemon-game',
    templateUrl: './pokemon-game.component.html'
})
export class PokemonGameComponent {

    directions: string = ''

    constructor(private router: Router) {}

    addDirection(direction: string): void {
        this.directions = this.directions.concat(direction)
    }

    play() {
        this.router.navigate(['results/', {directions: this.directions}])
    }
}

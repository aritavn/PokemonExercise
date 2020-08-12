import { NgModule } from '@angular/core'
import { Routes, RouterModule } from '@angular/router'
import { PokemonGameComponent } from './components/pokemon-game/pokemon-game.component'
import { GameResultComponent } from './components/game-result/game-result.component'

const routes: Routes = [
    {
        path: 'play',
        component: PokemonGameComponent
    },
    {
        path: 'results',
        component: GameResultComponent
    },
    {
        path: '',
        redirectTo: '/play',
        pathMatch: 'full'
    }
]

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }

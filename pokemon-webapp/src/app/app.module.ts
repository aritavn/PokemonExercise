import { BrowserModule } from '@angular/platform-browser'
import { NgModule } from '@angular/core'
import { HttpClientModule } from '@angular/common/http'

import { AppRoutingModule } from './app-routing.module'
import { AppComponent } from './app.component'
import { PokemonGameComponent } from './components/pokemon-game/pokemon-game.component'
import { CatchPokemonsService } from './services/catch-pokemons.service'
import { GameResultComponent } from './components/game-result/game-result.component'

@NgModule({
    declarations: [
        AppComponent,
        PokemonGameComponent,
        GameResultComponent
    ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        HttpClientModule
    ],
    providers: [
        CatchPokemonsService
    ],
    bootstrap: [AppComponent]
})
export class AppModule { }

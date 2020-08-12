import { Injectable } from '@angular/core'
import { HttpClient } from '@angular/common/http'
import { Observable, of } from 'rxjs'
import { catchError } from 'rxjs/operators'
import { environment } from '../../environments/environment'
import { Result } from '../models/result.model'

@Injectable()
export class CatchPokemonsService {

    private env: string = environment.API_URL

    constructor(private http: HttpClient) {}

    getGameResult(directions: string): Observable<Result> {
        let url = `${this.env}?moves=${directions}`

        return this.http.get<Result>(url)
            .pipe(
                catchError(this.handleError<Result>('getGameResult', null))
            )
    }

    private handleError<T> (operation = 'operation', result?: T) {
        return (error: any): Observable<T> => {
            console.log(operation)
            console.error(error)
            return of(result as T)
        }
    }
}
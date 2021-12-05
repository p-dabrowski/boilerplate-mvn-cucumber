Feature: Wplata i wyplata pieniedzy do bankomatu

  Background:
    Given Mam na koncie 1000 zlotych

  Scenario Outline: Wplacenie pieniedzy
    When Wplacam <kwota> zlotych
    Then Mam <saldo> zlotych
  Examples:
    |kwota|saldo|
    |100  |1100 |
    |250  |1250 |
    |300  |1300 |
    |1000 |2000 |

  Scenario: Wyplacenie pieniedzy
    When Wyplacam 300 zlotych
    Then Mam 700 zlotych

  Scenario: Wyplacenie zbyt wielkiej kwoty
    When Wyplacam 2000 zlotych
    Then Zostal rzucony wyjatek
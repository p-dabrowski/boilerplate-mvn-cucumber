Feature: Wplata i wyplata pieniedzy do bankomatu

  Background:
    Given Mam na koncie 1000 zlotych

  Scenario: Wplacenie pieniedzy
    When Wplacam 200 zlotych
    Then Mam 1200 zlotych

  Scenario: Wyplacenie pieniedzy
    When Wyplacam 300 zlotych
    Then Mam 700 zlotych

  Scenario: Wyplacenie zbyt wielkiej kwoty
    When Wyplacam 2000 zlotych
    Then Zostal rzucony wyjatek
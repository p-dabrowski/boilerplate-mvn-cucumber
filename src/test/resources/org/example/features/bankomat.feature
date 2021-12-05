Feature: Wplata pieniedzy do bankomatu

  Scenario: Wplacenie pieniedzy

    Given Mam na koncie 1000 zlotych
    When Wplatam 200 zlotych
    Then Mam 1200 zlotych
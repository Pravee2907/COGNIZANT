DECLARE
    CURSOR c IS
        SELECT CustomerID, LoanID, EndDate
        FROM Loans
        WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN

    FOR x IN c LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Customer ' || x.CustomerID ||
            ' Loan ' || x.LoanID ||
            ' is due on ' || TO_CHAR(x.EndDate, 'DD-MON-YYYY')
        );

    END LOOP;

END;

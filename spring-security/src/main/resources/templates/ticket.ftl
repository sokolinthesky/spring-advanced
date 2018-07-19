<#if ticket??>
    ${ticket.id}<br>
    ${ticket.title}<br>
    Booked: ${ticket.booked?string('yes', 'no')}
</#if>
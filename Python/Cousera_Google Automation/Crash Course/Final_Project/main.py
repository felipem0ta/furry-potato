def get_event_date(event):
    return event.date


def current_users(event_list):
    event_list.sort(key=get_event_date)
    machines = {}
    for event in event_list:
        if event.machine not in machines:
            machines[event.machine] = set()
        if event.type == "login":
            machines[event.machine].add(event.user)
        elif event.type == "logout":
            machines[event.machine].remove(event.user)
    return machines


def generate_report(machines):
    for machine, user in machines.items():
        if len(user) > 0:
            user_list = ", ".join(user)
            print("{}: {}".format(machine, user_list))


# classe que define os eventos
class Event:
    def __init__(self, event_date, event_type, machine_name, user):
        self.date = event_date
        self.type = event_type
        self.machine = machine_name
        self.user = user


# lista de eventos
events = [
    Event('2020-01-21 12:45:51', 'login', 'myworstation.local', 'jordan'),
    #Event('2020-01-22 01:43:18', 'logout', 'myworstation.local', 'jordan'),
    Event('2020-01-22 08:40:41', 'login', 'webserver.local', 'juci'),
    Event('2020-01-22 12:45:51', 'login', 'myworstation1.local', 'lucia'),
    Event('2020-01-22 12:45:51', 'login', 'myworstation2.local', 'maria'),
    Event('2020-01-23 12:45:51', 'login', 'myworstation3.local', 'fernando'),
    #Event('2020-01-23 12:45:51', 'logout', 'myworstation1.local', 'lucia'),
    #Event('2020-01-23 12:45:51', 'logout', 'myworstation2.local', 'maria'),
    #Event('2020-01-23 12:45:51', 'logout', 'myworstation3.local', 'fernando'),
    #Event('2020-01-24 12:45:51', 'logout', 'webserver.local', 'juci'),
    Event('2020-01-24 12:45:51', 'login', 'admin.local', 'jordan'),
    #Event('2020-01-24 12:45:51', 'logout', 'admin.local', 'jordan')
]

users = current_users(events)
print(users)

generate_report(users)

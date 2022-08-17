import os
import datetime


def create_python_script(filename):
    comments = "# Start of a new Python program"
    with open(filename, 'a') as arquivo:
        arquivo.write(comments)
        filezize = os.path.getsize(filename)
    return(filezize)

print(create_python_script("progam.py"))


import os

def new_directory(directory, filename):
  # Before creating a new directory, check to see if it already exists
  if os.path.isdir(directory) == False:
    os.mkdir(directory)

  # Create the new file inside of the new directory
  os.chdir(directory)
  with open (filename, 'w') as file:
    pass
  # Return the list of files in the new directory
  return os.listdir()

print(new_directory("PythonPrograms", "script.py"))


def file_date(filename):
  # Create the file in the current directory
  with open(filename, 'w'):
    pass
  timestamp = os.path.getmtime(filename)
  # Convert the timestamp into a readable format, then into a string
  readabletime = datetime.datetime.fromtimestamp(timestamp)
  # Return just the date portion 
  # Hint: how many characters are in “yyyy-mm-dd”? 
  return ("{}".format(readabletime.strftime("%Y-%m-%d")))

print(file_date("newfile.txt")) 
# Should be today's date in the format of yyyy-mm-dd
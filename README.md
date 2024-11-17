# A Formal Look at Programming – or –<br>The Disappearing Formal Method

*Emil Sekerinski, November 2024*

**Tutorial presented at [ICTAC 2024](https://ictac2024.cs.ait.ac.th/)**  
**Run in a web browser: https://emilsekerinski.github.io/ictac2024tutorial**
**GitHub source: https://github.com/emilsekerinski/ictac2024tutorial**

This training lecture provides an introduction to the classical theory of program correctness:
- Sequential programming
- Modularization (object-oriented programming)
- Robustness (exceptions)
- Concurrency (including semaphores and message passing)

These lecture notes
- use a visual formalism to be programming language independent,
- explore the algebraic structure of programs,
- connect the theory and common programming languages with interactive Jupyter notebooks.

The target audience is:
- students starting with formal methods or interested in strengthening their programming
- instructors looking to teach a more rigorous approach to programming.

The lecture material is accessible and available as an open educational resource. It includes a collection of exercises covering theory and programming.

The lecture notes come as Jupyter notebooks. There are several ways to run the notebooks:

|                         | JupyterLite        | Jupyter                                     | JupyterHub                                                                                                                                          |
|-------------------------|--------------------|---------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------|
| Installation            | no(*)              | easy(**)                                    | involved                                                                                                                                            |
| Code runs               | in browser         | locally or remotely                         | remotely on server                                                                                                                                  |
| Users                   | one                | one                                         | instructor and students                                                                                                                             |
| Classroom functionality | no                 | no                                          | via [nbgrader](https://nbgrader.readthedocs.io/):<br>releasing and collecting assignments<br>visible and hidden tests<br>manual and auto-grading of assignments |
| Kernel languages        | Python, JavaScript | Python, R, Julia, Haskell, ...              | Python, R, Julia, Haskell, ...                                                                                                                      |
| Shell commands          | no                 | yes                                         | yes                                                                                                                                                 |
| Other languages         | no                 | via shell any language:<br>Java, Go, C, ... | via shell any language:<br>Java, Go, C, ...                                                                                                         |                                                                                                              |

(*) Point browser to [emilsekerinski.github.io/ictac2024tutorial](https://emilsekerinski.github.io/ictac2024tutorial)
(**) Run `pip install jupyter` (`pip3 install jupyter` in macOS) after installing [Python](https://python.org)

Juypter has two user interfaces: Classic Jupyter (one notebook per browser window) and JupyterLab (multiple notebooks per browser window). This tutorial uses *JupyterLite* with *JupyterLab*.
